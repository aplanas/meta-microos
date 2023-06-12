SUMMARY = "A port of Ruby on Rails inflector to Python"
DESCRIPTION = "Inflection is a string transformation library.  It singularizes and pluralizes \
English words, and transforms strings from CamelCase to underscored string. \
Inflection is a port of `Ruby on Rails`_' `inflector`_ to Python."
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "python311-inflection-0.5.1-2.8.noarch.rpm"
RPM_HASH = "87f0af9a681d7046bcec870a198981a7e8898c45543e367a6cf9acc125b771241ed2d0fa2f9843cd4d0dd67030ec5b816fe86e93b5ff7877f2ee39934cfb940b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(inflection) \
python311-inflection \
python3dist(inflection)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
