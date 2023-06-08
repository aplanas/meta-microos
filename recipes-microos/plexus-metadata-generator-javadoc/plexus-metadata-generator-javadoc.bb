SUMMARY = "API documentation for plexus-metadata-generator"
DESCRIPTION = "API documentation for plexus-metadata-generator."
LICENSE = "Apache-2.0 & MIT & xpp"

PV = "2.1.1"

RPM_NAME = "plexus-metadata-generator-javadoc-2.1.1-4.1.noarch.rpm"
RPM_HASH = "eb54df91ecf4889bcef57d2dfae806c2076c6d6dc7bc7af1d09236d04daae6e5994d73b2ef8d30fcee4bbc4ca51c2da5104cffc8ef5650cbd1a14050f804ee74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-metadata-generator-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
