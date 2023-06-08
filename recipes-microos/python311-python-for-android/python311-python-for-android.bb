SUMMARY = "Android APK packager for Python scripts and apps"
DESCRIPTION = "Android APK packager for Python scripts and apps"
LICENSE = "MIT"

PV = "2022.9.4"

RPM_NAME = "python311-python-for-android-2022.9.4-2.4.noarch.rpm"
RPM_HASH = "41cc995c0f6cffb6077b08c564fb20a4969493a1ad3b11f5adf60c68fc9eeb9d5a0dac684ac5c741fe08a4c9a0c3003281b11e6db2bd991e038ee63077f08bfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-for-android) python311-python-for-android python3dist(python-for-android)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/bash /usr/bin/python3.11 python(abi) python311-Jinja2 python311-appdirs python311-colorama python311-pep517 python311-toml update-alternatives"

inherit rpm
