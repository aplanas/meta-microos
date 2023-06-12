SUMMARY = "Python library and command-line utility for Shodan"
DESCRIPTION = "Shodan is a search engine for Internet-connected devices. Google lets you search for websites, Shodan lets you search for devices. This library provides developers easy access to all of the data stored in Shodan in order to automate tasks and integrate into existing tools."
LICENSE = "MIT"

PV = "1.28.0"

RPM_NAME = "python310-shodan-1.28.0-1.5.noarch.rpm"
RPM_HASH = "a53aa0df0611a0989d61c776482cc9b89066367b5b8ab94019bf415330598ad9b98a9d6104fb4c95bc28948a84f0e63c4867b5bc5f883925c32f418d25b658bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-shodan python3.10dist(shodan) python310-shodan python3dist(shodan)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-XlsxWriter python310-click python310-click-plugins python310-colorama python310-requests python310-setuptools update-alternatives"

inherit rpm
