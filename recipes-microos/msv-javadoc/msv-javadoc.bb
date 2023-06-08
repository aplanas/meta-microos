SUMMARY = "API documentation for Multi-Schema Validator"
DESCRIPTION = "API documentation for Multi-Schema Validator."
LICENSE = "Apache-1.1 & BSD-3-Clause & Apache-2.0 & SUSE-Public-Domain"

PV = "2013.6.1"

RPM_NAME = "msv-javadoc-2013.6.1-3.10.noarch.rpm"
RPM_HASH = "5ab4fc2554d934c041b8db65ff1316dccb83621c360b17d13d87a8f118a235e7f8f9caa92d0f2dcc80bcd0679357e581783f8f09accc0776d4b5c95729c1c54a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "msv-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
