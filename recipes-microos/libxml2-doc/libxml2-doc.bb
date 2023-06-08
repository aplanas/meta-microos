SUMMARY = "Documentation for libxml, an XML manipulation library"
DESCRIPTION = "The XML C library was initially developed for the GNOME project. It is \
now used by many programs to load and save extensible data structures \
or manipulate any kind of XML files."
LICENSE = "MIT"

PV = "2.10.4"

RPM_NAME = "libxml2-doc-2.10.4-2.1.noarch.rpm"
RPM_HASH = "44d9cc934f3318901206dbb48f397158667d65e83ac01d3d0a998b73e4beb580fbd3879919a658c6b2597a5d4bbd59dc3f9aa71cc4850f61c9b3c940110956a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libxml2-doc"
RDEPENDS:${PN} += "libxml2-2"

inherit rpm
