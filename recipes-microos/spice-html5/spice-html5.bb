SUMMARY = "Pure Javascript SPICE client"
DESCRIPTION = "spice-html5 is a Javascript SPICE client.  This includes a simple HTML \
page to initiate a session, and the client itself.  It includes a configuration \
file for Apache, but should work with any web server."
LICENSE = "LGPL-3.0-only"

PV = "0.3.0"

RPM_NAME = "spice-html5-0.3.0-1.2.noarch.rpm"
RPM_HASH = "2af77b76194f70e6f608e5ef3e2f87355776ccb54733cbdb29e42182a3c847667ab86afe164418232c267c358539d4ab99782a71603b12ab7fa6c19d491dcfaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "spice-html5"
RDEPENDS:${PN} += ""

inherit rpm
