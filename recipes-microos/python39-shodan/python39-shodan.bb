SUMMARY = "Python library and command-line utility for Shodan"
DESCRIPTION = "Shodan is a search engine for Internet-connected devices. Google lets you search for websites, Shodan lets you search for devices. This library provides developers easy access to all of the data stored in Shodan in order to automate tasks and integrate into existing tools."
LICENSE = "MIT"

PV = "1.28.0"

RPM_NAME = "python39-shodan-1.28.0-1.5.noarch.rpm"
RPM_HASH = "579b61cbdbd29334a056163dc6f379fc2387d18fdaa3d381cfad9b87f48ece14c88b95f84a4593692c28106b47c491a2f0f0b983893f2dc162a403e1f247b1e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(shodan) python39-shodan python3dist(shodan)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-XlsxWriter python39-click python39-click-plugins python39-colorama python39-requests python39-setuptools update-alternatives"

inherit rpm
