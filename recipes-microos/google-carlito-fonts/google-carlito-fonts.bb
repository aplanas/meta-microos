SUMMARY = "Sans-serif Font Metrics-compatible with Calibri"
DESCRIPTION = "Modern, friendly sans-serif font derived from the Lato font that is \
designed to be a metrics-compatible drop-in replacement for Calibri. \
Contains Regular, Bold, Italic, and Bold Italic version. \
 \
Designed by Lukasz Dziedzic of tyPoland for Google."
LICENSE = "OFL-1.1"

PV = "1.1.03.beta1"

RPM_NAME = "google-carlito-fonts-1.1.03.beta1-3.17.noarch.rpm"
RPM_HASH = "04301c36b5f76621a45d102a7be4515e17e12c775decd5cf9af285cd5645fb10fd94efe997076466c4a77e538098b16c77862ad202373ecd45ab6cd782acf632"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-carlito-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
