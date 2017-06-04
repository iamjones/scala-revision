package linearization

object Linearization extends App {

    println("-------- Linearization --------")

    /**
      * Called the draw method of Artist because Artist
      * is mixed in after Gangster
      */
    new GangsterArtist().draw()

    /**
      * Called the draw method of Gangster because Gangster
      * is mixed in after Artist
      */
    new ArtistGangster().draw()
}


trait Drawable {
    def draw() { }
}

trait Gangster extends Drawable {
    override def draw() { println("Bang!") }
}

trait Artist extends Drawable {
    override def draw() { println("A pretty painting") }
}

class GangsterArtist extends Gangster with Artist

class ArtistGangster extends Artist with Gangster