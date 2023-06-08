SUMMARY = "Modular Internet Client Documentation"
DESCRIPTION = "This packages provides documentation of LeechCraft core API. \
 \
It contains description of core API used for developing first-level \
LeechCraft plugins. For developing sub-plugins, please refer to \
corresponding packages (like leechcraft-azoth-doc). This documentation \
is also available online at http://doc.leechcraft.org/core/"
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-doc-0.6.70+git.14794.g33744ae6ce-3.1.noarch.rpm"
RPM_HASH = "a2b494391016bfe7c587ca0fcef364720aa00127b72d5383621ac86aaabc40ff848adae6e4b602ae6f2acf016a4177c2169bd93b506e584553afff4f3035c10a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "leechcraft-doc"
RDEPENDS:${PN} += ""

inherit rpm
