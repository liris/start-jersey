fun makeGuiceBridge(serviceLocator: ServiceLocator) {
        GuiceBridge.getGuiceBridge().initializeGuiceBridge(serviceLocator)
        val bridge = serviceLocator.getService(GuiceIntoHK2Bridge::class.java)
        bridge.bridgeGuiceInjector(Guice.createInjector(object: ServletModule() {
            override fun configureServlets() {
                super.configureServlets()
                Names.bindProperties(binder(), props)

                for (klass in serviceClasses) {
                    bind(klass).`in`(Singleton::class.java)
                }

                for (klass in diClasses) {
                    bind(klass)
                }
                for (klass in diSingletons) {
                    bind(klass)
                }
            }
        }))
    }
