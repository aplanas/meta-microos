SUMMARY = "Documentation for lua53-luasocket"
DESCRIPTION = "This subpackage contains documentation for lua53-luasocket."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "lua53-luasocket-doc-3.1.0-2.2.noarch.rpm"
RPM_HASH = "013e46719b346665d25d5e5a7ad0f603fdf8a3fdd49ce268d7305938917c1d8b626529a7b450aeff957ff85c980d20236f2b2d0cb205c941dab0efa157a4ed32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-luasocket-doc"
RDEPENDS:${PN} += ""

inherit rpm
