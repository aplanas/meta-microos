SUMMARY = "The SeaMonkey DOM Inspector"
DESCRIPTION = "This is a tool that allows you to inspect the DOM for web pages in \
SeaMonkey. This is of great use to people who are doing SeaMonkey \
chrome development or web page development."
LICENSE = "MPL-2.0"

PV = "2.53.16"

RPM_NAME = "seamonkey-dom-inspector-2.53.16-1.2.aarch64.rpm"
RPM_HASH = "7fb190426b81c6feb469265c87a719bddef4da8b56439713489ce8992aa5c6599719ed0a235eb03ab495a11904664397ce465412aec20d6bdf42092bfdb722cd"

RPROVIDES:${PN} += "seamonkey-dom-inspector \
seamonkey-dom-inspector(aarch-64)"
RDEPENDS:${PN} += "seamonkey"

inherit rpm
