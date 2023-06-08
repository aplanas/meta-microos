SUMMARY = "A port of Ruby on Rails inflector to Python"
DESCRIPTION = "Inflection is a string transformation library.  It singularizes and pluralizes \
English words, and transforms strings from CamelCase to underscored string. \
Inflection is a port of `Ruby on Rails`_' `inflector`_ to Python."
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "python310-inflection-0.5.1-2.8.noarch.rpm"
RPM_HASH = "00963fa83159ef254057163587c1968a0ffe9a1d323f7d221c8a10a65917a9c5e4e9335a362cda7f04d33a6755c63a5a47416e954fcc4316474da7ed3bc81068"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-inflection python3.10dist(inflection) python310-inflection python3dist(inflection)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
