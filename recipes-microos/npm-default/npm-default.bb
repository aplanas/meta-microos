SUMMARY = "Default version of npm"
DESCRIPTION = "Depends on the npm version associated with the current default \
version of nodejs for the current architecture and codestream."
LICENSE = "MIT"

PV = "5.1"

RPM_NAME = "npm-default-5.1-2.1.aarch64.rpm"
RPM_HASH = "c75513fcedaf2c0d70c169f292b67cde3649600732914e8e2d2fe77e23151240096300ab6f25af0e2a16708af18d05f579ed6776c4c3b74c930df23568d0a0c1"

RPROVIDES:${PN} += "npm npm-default npm-default(aarch-64)"
RDEPENDS:${PN} += "nodejs-default npm20"

inherit rpm
