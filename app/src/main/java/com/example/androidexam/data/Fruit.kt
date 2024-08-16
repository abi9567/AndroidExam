package com.example.androidexam.data

data class FruitCategory(
    val index : Int,
    val imageUrl : String?,
    val name : String?,
    var fruitList : List<Fruit?>?
) {
    companion object {
        val fruitList = listOf(
            FruitCategory(
                name = "Citrus Fruits",
                imageUrl = "https://cdn.firstcry.com/education/2022/11/29120033/Citrus-Fruits-Names-for-Preschoolers-and-Kids.jpg",
                index = 0, fruitList = listOf(
                    Fruit(name = "Lemon", image = null, description = "A sour, yellow citrus fruit used in cooking and beverages."),
                    Fruit(name = "Orange", image = "https://upload.wikimedia.org/wikipedia/commons/c/c4/Orange-Fruit-Pieces.jpg", description = "A sweet, orange-colored citrus fruit."),
                    Fruit(name = "Lime", image = null, description = "A small, green citrus fruit often used in cooking and cocktails."),
                    Fruit(name = "Grapefruit", image = null  , description = "A large, tart citrus fruit with a slightly bitter taste."),
                    Fruit(name = "Tangerine", image = null, description = "A small, orange citrus fruit similar to a mandarin."),
                    Fruit(name = "Pomelo", image = null, description =  "A large, yellow citrus fruit with a sweet and mild flavor."),
                    Fruit(name = "Mandarin", image = null, description = "A small, orange citrus fruit known for its sweetness."),
                    Fruit(name = "Kumquat", image = null, description = "A small, oval citrus fruit that is sweet on the outside and tart on the inside."),
                    Fruit(name = "Citron", image = null, description = "A large, yellow citrus fruit with a thick rind, often used in cooking."),
                    Fruit(name = "Bergamot", image = null, description = "A fragrant citrus fruit with a sour, bitter taste, used in perfumes and tea."),
                    Fruit(name = "Yuzu", image = null, description = "A small, round citrus fruit with a sour flavor, commonly used in Japanese cuisine."),
                    Fruit(name = "Calamondin", image = null, description = "A small, sour citrus fruit used in cooking, especially in Filipino cuisine."),
                    Fruit(name = "Sudachi", image = null, description = "A small, green citrus fruit with a sour taste, used in Japanese cuisine."),
                    Fruit(name = "Kabosu", image = null, description = "A sour, green citrus fruit used in Japanese cooking."),
                    Fruit(name = "Seville Orange", image = null, description = "A bitter orange used in marmalades and flavorings."),
                    Fruit(name = "Blood Orange", image = null, description = "A variety of orange with red flesh and a slightly sweet flavor."),
                    Fruit(name = "Meyer Lemon", image = null, description = "A sweeter, less acidic variety of lemon."),
                    Fruit(name = "Finger Lime", image = null, description = "A small, elongated citrus fruit with caviar-like juice vesicles."),
                    Fruit(name = "Etrog", image = null, description = "A yellow citron used in Jewish religious ceremonies."),
                    Fruit(name = "Satsuma", image = null, description = "A seedless, easy-to-peel citrus fruit with a sweet flavor.")
                )
            ),

            FruitCategory(
                name = "Berries",
                imageUrl = "https://media.istockphoto.com/id/499658564/photo/wild-berry-mix-strawberries-blueberries-blackberries-and-raspberries.jpg?s=612x612&w=0&k=20&c=H-hRK6piHD2TyIFZ2sezzduHJ2xYpKyoTil4776sklA=",
                index = 1, fruitList = listOf(
                    Fruit(name = "Strawberry", image = "https://upload.wikimedia.org/wikipedia/commons/2/29/PerfectStrawberry.jpg", description = "A sweet, red berry with a juicy texture."),
                    Fruit(name = "Blueberry", image = null , description = "A small, round, blue-purple berry with a sweet and tangy flavor."),
                    Fruit(name = "Raspberry", image = null, description = "A red or black berry with a sweet and slightly tart flavor."),
                    Fruit(name = "Blackberry", image = null,  description = "A dark purple to black berry with a sweet and tart flavor."),
                    Fruit(name = "Cranberry", image = null, description = "A small, red berry with a very tart taste, often used in sauces."),
                    Fruit(name = "Gooseberry", image = null,  description = "A small, round, green or red berry with a tart flavor."),
                    Fruit(name = "Elderberry", image = null, description = "A small, dark purple berry used in syrups and medicinal remedies."),
                    Fruit(name = "Boysenberry", image = null, description = "A large, sweet-tart berry that is a cross between a raspberry, blackberry, and loganberry."),
                    Fruit(name = "Huckleberry", image = null, description = "A small, round, dark blue or black berry with a sweet and tart flavor."),
                    Fruit(name = "Mulberry", image = null, description = "A small, dark purple berry with a sweet flavor, often used in jams."),
                    Fruit(name = "Cloudberry", image = null, description = "A rare, golden-yellow berry with a sweet and tart flavor."),
                    Fruit(name = "Currant", image = null, description = "A small, round berry that can be red, black, or white, with a tart flavor."),
                    Fruit(name = "Lingonberry", image = null, description = "A small, red berry with a tart flavor, popular in Scandinavian cuisine."),
                    Fruit(name = "Açaí Berry", image = null, description = "A small, dark purple berry known for its high antioxidant content."),
                    Fruit(name = "Goji Berry", image = null, description = "A small, red berry with a slightly sweet and sour flavor, often used in health foods."),
                    Fruit(name = "Barberry", image = null, description = "A small, red berry with a tart flavor, often used in Middle Eastern cuisine."),
                    Fruit(name = "Sea Buckthorn Berry", image = null, description = "A small, orange berry with a tart flavor, used in juices and health products."),
                    Fruit(name = "Chokeberry", image = null, description = "A small, dark berry with a tart and slightly bitter flavor, often used in juices and jams."),
                    Fruit(name = "Serviceberry", image = null, description = "A small, round, red to purple berry with a sweet flavor, used in pies and jams."),
                    Fruit(name = "Salmonberry", image = null, description = "A large, orange to red berry with a sweet and tart flavor, found in the Pacific Northwest.")
                )
            ),

            FruitCategory(
                name = "Stone Fruits",
                imageUrl = "https://cdn.sanity.io/images/bow86i8j/production/525094835cc33324c1ec39705b74c28db0b0f449-1800x920.jpg?fit=crop&h=630&q=75&w=1200",
                index = 2, fruitList = listOf(
                    Fruit(name = "Peach", image = null, description = "A sweet, juicy fruit with a fuzzy skin and a large pit."),
                    Fruit(name = "Plum", image = null, description = "A smooth-skinned fruit with a sweet, tart flavor and a large pit."),
                    Fruit(name = "Cherry", image = null, description = "A small, round fruit with a sweet or tart flavor and a large pit."),
                    Fruit(name = "Apricot", image = null, description = "A small, orange fruit with a sweet flavor and a smooth skin."),
                    Fruit(name = "Nectarine", image = null, description = "A smooth-skinned fruit similar to a peach but without the fuzz."),
                    Fruit(name = "Avocado", image = null, description = "A creamy, green fruit with a large pit, often used in savory dishes."),
                    Fruit(name = "Olive", image = null, description = "A small, bitter fruit often used for its oil."),
                    Fruit(name = "Date", image = null, description = "A sweet, chewy fruit with a large pit, often used in desserts."),
                    Fruit(name = "Cashew", image = null, description = "A small, kidney-shaped nut with a sweet, buttery flavor."),
                    Fruit(name = "Macadamia", image = null, description = "A small, round nut with a rich, buttery flavor, often used in baking.")
                )
            ),

            FruitCategory(
                name = "Tropical Fruits",
                imageUrl = "https://www.tastingtable.com/img/gallery/14-fruits-uncommon-in-the-u-s-you-need-to-try-once/intro-1679850799.jpg",
                index = 3, fruitList = listOf(
                    Fruit(name = "Mango", image = "https://upload.wikimedia.org/wikipedia/commons/9/90/Hapus_Mango.jpg", description = "A juicy, sweet tropical fruit with yellow-orange flesh."),
                    Fruit(name = "Pineapple", image = "https://upload.wikimedia.org/wikipedia/commons/c/cb/Pineapple_and_cross_section.jpg", description = "A tropical fruit with sweet, tangy yellow flesh and a spiky exterior."),
                    Fruit(name = "Papaya", image = null, description = "A large, orange-fleshed tropical fruit with a sweet flavor."),
                    Fruit(name = "Banana", image = "https://upload.wikimedia.org/wikipedia/commons/8/8a/Banana-Single.jpg", description = "A long, yellow fruit with a sweet, creamy flesh."),
                    Fruit(name = "Coconut", image = null, description = "A tropical fruit with a hard shell and sweet, white flesh inside."),
                    Fruit(name = "Passion Fruit", image = null, description = "A small, round fruit with a tangy, seedy pulp."),
                    Fruit(name = "Guava", image = null, description = "A tropical fruit with a sweet, pink or white flesh."),
                    Fruit(name = "Lychee", image = null, description = "A small, round fruit with a sweet, white flesh and a rough, red skin."),
                    Fruit(name = "Dragon Fruit", image = null, description = "A brightly colored fruit with a sweet, white or red flesh filled with tiny black seeds."),
                    Fruit(name = "Durian", image = null, description = "A large, spiky fruit with a strong odor and creamy flesh, known as the 'king of fruits.'"),
                    Fruit(name = "Jackfruit", image = null, description = "A large, green fruit with a sweet, yellow flesh that has a texture similar to meat."),
                    Fruit(name = "Rambutan", image = null, description = "A small, red or yellow fruit with a hairy skin and sweet, translucent flesh."),
                    Fruit(name = "Mangosteen", image = null, description = "A purple tropical fruit with a sweet and tangy white flesh."),
                    Fruit(name = "Starfruit", image = null, description = "A star-shaped fruit with a sweet and slightly tart flavor."),
                    Fruit(name = "Pomegranate", image = null, description = "A fruit with a tough outer rind and juicy, seed-filled interior."),
                    Fruit(name = "Papaya", image = null, description = "A tropical fruit with orange flesh and a sweet, musky flavor."),
                    Fruit(name = "Longan", image = null, description = "A small, round fruit with a translucent flesh and a sweet, musky flavor."),
                    Fruit(name = "Mangaba", image = null, description = "A tropical fruit native to Brazil, with a sweet and sour taste."),
                    Fruit(name = "Breadfruit", image = null, description = "A large, green fruit with a starchy texture, often used as a staple food."),
                    Fruit(name = "Sugar Apple", image = null, description = "A tropical fruit with a sweet, creamy flesh inside a bumpy green rind.")
                )
            ),

            FruitCategory(
                name = "Melons",
                imageUrl = "https://nutrivore.com/wp-content/uploads/2022/12/Melons-1024x683.jpg",
                index = 4, fruitList = listOf(
                    Fruit(name = "Watermelon", image = null, description = "A large, green-skinned fruit with sweet, juicy red flesh."),
                    Fruit(name = "Cantaloupe", image = null, description = "A round melon with orange flesh and a sweet, musky flavor."),
                    Fruit(name = "Honeydew", image = null, description = "A sweet, green-fleshed melon with a smooth rind."),
                    Fruit(name = "Galia Melon", image = null, description = "A hybrid melon with sweet, green flesh."),
                    Fruit(name = "Santa Claus Melon", image = null, description = "A large melon with a green rind and sweet, white flesh."),
                    Fruit(name = "Canary Melon", image = null, description = "A bright yellow melon with sweet, juicy flesh."),
                    Fruit(name = "Crenshaw Melon", image = null, description = "A sweet melon with a smooth, yellow rind and salmon-colored flesh."),
                    Fruit(name = "Casaba Melon", image = null, description = "A large melon with a wrinkled rind and mild, sweet flesh."),
                    Fruit(name = "Bitter Melon", image = null, description = "A small, bumpy melon with a bitter taste."),
                    Fruit(name = "Korean Melon", image = null, description = "A small, yellow melon with sweet, crisp flesh."),
                    Fruit(name = "Charentais Melon", image = null, description = "A small, fragrant melon with sweet, orange flesh."),
                    Fruit(name = "Sprite Melon", image = null, description = "A small, sweet melon with crisp, white flesh."),
                    Fruit(name = "Hami Melon", image = null, description = "A large, sweet melon with a crisp texture."),
                    Fruit(name = "Sugar Kiss Melon", image = null, description = "A small, very sweet melon with tender flesh."),
                    Fruit(name = "Horned Melon", image = null, description = "A spiky, orange melon with a tart, jelly-like green interior."),
                    Fruit(name = "Sharlyn Melon", image = null, description = "A melon with a netted rind and sweet, aromatic flesh."),
                    Fruit(name = "Piel de Sapo", image = null, description = "A large, green-skinned melon with sweet, white flesh."),
                    Fruit(name = "Golden Langkawi Melon", image = null, description = "A small, sweet melon with golden skin and tender flesh."),
                    Fruit(name = "Snow Leopard Melon", image = null, description = "A melon with a unique appearance and sweet flavor.")
                )
            )
        )
    }
}

data class Fruit(
    val name : String?,
    val image : String?,
    val description : String?
)
