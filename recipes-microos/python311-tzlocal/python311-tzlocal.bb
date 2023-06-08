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

RPM_NAME = "python311-tzlocal-4.3-1.1.noarch.rpm"
RPM_HASH = "e275756a5a928c1be3b8d1d38f8eb77dc9599acd9e225916561d2636e8fe750d43a2d29914d083662813aa6ad4fc09ca2f4d320489a7721fe658a07bcd40530c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(tzlocal) python311-tzlocal python3dist(tzlocal)"
RDEPENDS:${PN} += "python(abi) python311-pytz python311-pytz-deprecation-shim"

inherit rpm
