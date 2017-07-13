open class TransactionTemplate
@Inject
constructor(
        @Named("database.spanner.project_id") private val projectId: String,
        @Named("database.spanner.instance_id") private val instanceId: String,
        @Named("database.spanner.database_id") private val databaseId: String,
        @Named("database.spanner.factoryPerThread") perThread: Boolean) {

}
