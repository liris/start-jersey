@Path("plus")
open class HelloResource {
    @GET
    fun plus(): Int {
        return 1 + 1
    }
}

@Path("plus")
open class MySampleResource {
    @GET
    fun plus(@QueryParam("a") a: Int, @QueryParam("b") b: Int): Int {
        return a + b
    }
}
