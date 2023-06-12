SUMMARY = "A recipe app for GNOME -- Search Provider for GNOME Shell"
DESCRIPTION = "GNOME Recipes is an easy-to-use application that will help you to discover what to cook \
today, tomorrow, rest of the week and for your special occasions. \
 \
Recipes comes with a collection of recipes that have been collected by GNOME contributors \
from all over the world. It also lets you store your own recipes, and share them with your \
friends. \
 \
This package contains a search provider to enable GNOME Shell to get \
search results from Recipes."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.4"

RPM_NAME = "gnome-shell-search-provider-gnome-recipes-2.0.4-1.17.aarch64.rpm"
RPM_HASH = "629395c9d45f10436b6f3e82bade703b752229879c83a1fab5be5d50c560be50276526318e46e523974ba449ea2ae7ede5cd208079924ab24e107de7410363c4"

RPROVIDES:${PN} += "gnome-shell-search-provider-gnome-recipes \
gnome-shell-search-provider-gnome-recipes(aarch-64)"
RDEPENDS:${PN} += "gnome-recipes \
gnome-shell"

inherit rpm
