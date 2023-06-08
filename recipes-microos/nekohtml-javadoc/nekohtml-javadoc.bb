SUMMARY = "Javadoc for nekohtml"
DESCRIPTION = "Javadoc for nekohtml."
LICENSE = "Apache-2.0"

PV = "1.9.22.noko2"

RPM_NAME = "nekohtml-javadoc-1.9.22.noko2-1.4.noarch.rpm"
RPM_HASH = "fa3c0da21c432248368f7361224d79ac67af60e7db7812ac322528c7dfd5d528c43058c4b32bd4d883af77e99cdd733ac2dbe6ccf676f0f3bd3533c72824d7ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nekohtml-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
