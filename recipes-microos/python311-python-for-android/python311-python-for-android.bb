SUMMARY = "Android APK packager for Python scripts and apps"
DESCRIPTION = "Android APK packager for Python scripts and apps"
LICENSE = "MIT"

PV = "2023.2.10"

RPM_NAME = "python311-python-for-android-2023.2.10-1.1.noarch.rpm"
RPM_HASH = "22a4663c59e13bfcf2abec72664eab2dd44672ae41d4874650dcbb333e77a6e7e5e0ae8cf6f3fca04ed32ca8fa8e2fc011c4e72f200df97283474427250d6bf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-for-android) python311-python-for-android python3dist(python-for-android)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/bash /usr/bin/python3.11 python(abi) python311-Jinja2 python311-appdirs python311-build python311-colorama python311-toml update-alternatives"

inherit rpm
