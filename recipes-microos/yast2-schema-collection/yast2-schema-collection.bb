SUMMARY = "Collection of yast2-schema autoyast XML definitions of released distributions"
DESCRIPTION = "Contains a collection of yast2-schema autoyast XML definitions of released distributions. \
Those are needed to be able to validate autoyast XML files you might want to use for auto installations"
LICENSE = "GPL-2.0-or-later"

PV = "0.0.1"

RPM_NAME = "yast2-schema-collection-0.0.1-2.6.noarch.rpm"
RPM_HASH = "fe37be10835f4e4e111f91363c4aecf84281f4f56bd55aaa7d0364e04f3bba984c9aaa1cd54378ad3a6582a10751c0d982a9c7ca2cf9df692a4410cab8cf6090"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-schema-collection"
RDEPENDS:${PN} += ""

inherit rpm
