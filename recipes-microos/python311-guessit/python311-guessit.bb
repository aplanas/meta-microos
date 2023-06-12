SUMMARY = "A library for guessing information from video files"
DESCRIPTION = "GuessIt is a Python library that extracts as much information as \
possible from a video file. \
It has a filename matcher that allows to guess a lot of metadata from \
a video using its filename only. This matcher works with both movies \
and TV shows episodes."
LICENSE = "LGPL-3.0-only"

PV = "3.7.1"

RPM_NAME = "python311-guessit-3.7.1-1.4.noarch.rpm"
RPM_HASH = "40f7aa36621f35d3f5f5bcbd74d0b937f80a06aea0b7829f39221f851415c5d17975e0dfb6754f7a17814f62b00df2b01667fe99925342aef1c1d08ddee303f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(guessit) \
python311-guessit \
python3dist(guessit)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-babelfish \
python311-importlib-resources \
python311-python-dateutil \
python311-rebulk \
update-alternatives"

inherit rpm
