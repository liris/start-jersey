@Path("plus")
open class HelloResource {
    @GET
    fun plus(): Int {
        return 1 + 1
    }
}
