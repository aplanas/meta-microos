SUMMARY = "Python library and command-line utility for Shodan"
DESCRIPTION = "Shodan is a search engine for Internet-connected devices. Google lets you search for websites, Shodan lets you search for devices. This library provides developers easy access to all of the data stored in Shodan in order to automate tasks and integrate into existing tools."
LICENSE = "MIT"

PV = "1.28.0"

RPM_NAME = "python311-shodan-1.28.0-1.4.noarch.rpm"
RPM_HASH = "2722b4449caa892f181feaaeb1f524c6f713efdee7299e4eeb7ed124d5f4117ed13e6844b7c70ea892e6d9da93d479b03110eceabe0e87f6937ffff9e8ec5881"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(shodan) python311-shodan python3dist(shodan)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-XlsxWriter python311-click python311-click-plugins python311-colorama python311-requests python311-setuptools update-alternatives"

inherit rpm
