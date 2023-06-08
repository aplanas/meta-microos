SUMMARY = "Python library and command-line utility for Shodan"
DESCRIPTION = "Shodan is a search engine for Internet-connected devices. Google lets you search for websites, Shodan lets you search for devices. This library provides developers easy access to all of the data stored in Shodan in order to automate tasks and integrate into existing tools."
LICENSE = "MIT"

PV = "1.28.0"

RPM_NAME = "python39-shodan-1.28.0-1.4.noarch.rpm"
RPM_HASH = "fe42b20f965edfb9c8f564cfa1718ffa41a2b28996485a38eea5385c91bc1d159f5258e5fcf60e5ea553ac18ce0ef06b9ebab6974a885295b3436fef0af05df2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(shodan) python39-shodan python3dist(shodan)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-XlsxWriter python39-click python39-click-plugins python39-colorama python39-requests python39-setuptools update-alternatives"

inherit rpm
