SUMMARY = "DOM support for saxon8"
DESCRIPTION = "Provides additional classes enabling Saxon to be used with the DOM \
Document Object Model. Supports using a DOM as the input or output of \
transformations and queries, and calling extension functions that use \
DOM interfaces to access a Saxon tree structure. Requires DOM level 3 \
(dom.jar, part of JAXP 1.3) to be on the classpath, if not running \
under JDK 1.5."
LICENSE = "MPL-1.1"

PV = "B.8.8"

RPM_NAME = "saxon8-dom-B.8.8-133.6.noarch.rpm"
RPM_HASH = "2f00d8761c1ed98d7e7d28dd8929b4005cd691315694981c16270324d9967e7457ad78df9f7e70ac45c36e8bc3ac8eab13a5d2afb791f66c1afead32a05581c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saxon8-dom"
RDEPENDS:${PN} += "saxon8"

inherit rpm
