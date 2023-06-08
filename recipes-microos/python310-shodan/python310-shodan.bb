SUMMARY = "Python library and command-line utility for Shodan"
DESCRIPTION = "Shodan is a search engine for Internet-connected devices. Google lets you search for websites, Shodan lets you search for devices. This library provides developers easy access to all of the data stored in Shodan in order to automate tasks and integrate into existing tools."
LICENSE = "MIT"

PV = "1.28.0"

RPM_NAME = "python310-shodan-1.28.0-1.4.noarch.rpm"
RPM_HASH = "671bdb07d419ce2a1d4cdc101c0702e220ff0d6eb9a7bedc1740654c0fba268bd2650ca807b450833f088e6ff4352a429ea9cf7daeef602eee4c04c9bf6d994f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-shodan python3.10dist(shodan) python310-shodan python3dist(shodan)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-XlsxWriter python310-click python310-click-plugins python310-colorama python310-requests python310-setuptools update-alternatives"

inherit rpm
