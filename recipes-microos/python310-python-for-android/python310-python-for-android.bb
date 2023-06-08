SUMMARY = "Android APK packager for Python scripts and apps"
DESCRIPTION = "Android APK packager for Python scripts and apps"
LICENSE = "MIT"

PV = "2022.9.4"

RPM_NAME = "python310-python-for-android-2022.9.4-2.4.noarch.rpm"
RPM_HASH = "3f77bd3b501ec64b4b15a76bdb18954352acb2425525038f439c1df8326bc85d0ecb9ed1ae7327591bd8f1b927cfe9999fca5002ec685536f9ad930a37ceed31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-for-android python3.10dist(python-for-android) python310-python-for-android python3dist(python-for-android)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/bash /usr/bin/python3.10 python(abi) python310-Jinja2 python310-appdirs python310-colorama python310-pep517 python310-toml update-alternatives"

inherit rpm
