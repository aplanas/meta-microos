SUMMARY = "Javadoc for jdom2"
DESCRIPTION = "This package contains javadoc for jdom2."
LICENSE = "Saxpath"

PV = "2.0.6.1"

RPM_NAME = "jdom2-javadoc-2.0.6.1-1.6.noarch.rpm"
RPM_HASH = "9a5bc57610dd4c77fd12097054f45a3fe36e4346c590a761aa3940a4fbbe91cf42525e5d82024c1075aeb7422c9c3aea3c5332d095746f3eba3aab69238c3b4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jdom2-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
