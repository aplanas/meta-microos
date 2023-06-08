SUMMARY = "tzinfo object for the local timezone"
DESCRIPTION = "This Python module returns a tzinfo object with the local timezone information \
under Unix and Win-32. It requires pytz, and returns pytz tzinfo objects. \
 \
This module attempts to fix a glaring hole in pytz, that there is no way to get \
the local timezone information, unless you know the zoneinfo name, and under \
several Linux distros that’s hard or impossible to figure out. \
 \
Also, with Windows different timezone system using pytz isn’t of much use unless \
you separately configure the zoneinfo timezone name. \
 \
With tzlocal you only need to call get_localzone() and you will get a tzinfo \
object with the local time zone info. On some Unices you will still not get to \
know what the timezone name is, but you don’t need that when you have the tzinfo \
file. However, if the timezone name is readily available it will be used."
LICENSE = "MIT"

PV = "4.3"

RPM_NAME = "python39-tzlocal-4.3-1.1.noarch.rpm"
RPM_HASH = "f2adb2a1ebeb1571e9dd07d1ec1384a80b2538c4ed65b6a70a301bd4f2f456cc4ce06e07e9cf496f78db1a87a3b9d50f0bc1da0e72b70f8208f6abe7c1714bf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(tzlocal) python39-tzlocal python3dist(tzlocal)"
RDEPENDS:${PN} += "python(abi) python39-pytz python39-pytz-deprecation-shim"

inherit rpm
