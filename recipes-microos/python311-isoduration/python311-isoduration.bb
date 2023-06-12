SUMMARY = "Operations with ISO 8601 durations"
DESCRIPTION = "ISO 8601 is most commonly known as a way to exchange datetimes in textual format. \
A lesser known aspect of the standard is the representation of durations. They \
have a shape similar to this: \
 \
    P3Y6M4DT12H30M5S \
 \
This string represents a duration of 3 years, 6 months, 4 days, 12 hours, \
30 minutes, and 5 seconds. \
 \
The state of the art of ISO 8601 duration handling in Python is more or less \
limited to what's offered by isodate. What we are trying to achieve here is to \
address the shortcomings of isodate (as described in their own Limitations section), \
and a few of our own annoyances with their interface, such as the lack of uniformity \
in their handling of types, and the use of regular expressions for parsing."
LICENSE = "ISC"

PV = "20.11.0"

RPM_NAME = "python311-isoduration-20.11.0-2.1.noarch.rpm"
RPM_HASH = "b9a8a5b318737b18a3bc8a45dfc7041619a5aa802784fa3aa2895adcdf0dba6c7d78facd65b4f208ff2bfe56541054b2ffcbc282edc38c46ebdc8ef0f8b22e64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(isoduration) \
python311-isoduration \
python3dist(isoduration)"
RDEPENDS:${PN} += "python(abi) \
python311-arrow"

inherit rpm
