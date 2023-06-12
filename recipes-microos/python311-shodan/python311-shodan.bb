SUMMARY = "Python library and command-line utility for Shodan"
DESCRIPTION = "Shodan is a search engine for Internet-connected devices. Google lets you search for websites, Shodan lets you search for devices. This library provides developers easy access to all of the data stored in Shodan in order to automate tasks and integrate into existing tools."
LICENSE = "MIT"

PV = "1.28.0"

RPM_NAME = "python311-shodan-1.28.0-1.5.noarch.rpm"
RPM_HASH = "bd5b1636231db23ac4247c0f46caf643536e5c5e72ef973fc0d232c74a0a0812d85a24181242ad9ada73a5fdcb4954dad9e53f00138f9cc18ebce8c272a65dac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(shodan) python311-shodan python3dist(shodan)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-XlsxWriter python311-click python311-click-plugins python311-colorama python311-requests python311-setuptools update-alternatives"

inherit rpm
