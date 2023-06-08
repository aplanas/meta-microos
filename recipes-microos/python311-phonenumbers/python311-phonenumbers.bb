SUMMARY = "Python version of Google's common library for international phone numbers"
DESCRIPTION = "Python version of Google's common library for parsing, formatting, storing \
and validating international phone numbers."
LICENSE = "Apache-2.0"

PV = "8.13.5"

RPM_NAME = "python311-phonenumbers-8.13.5-1.3.noarch.rpm"
RPM_HASH = "43935961eb9a2c77449476f675abc12249060910b48678ff65687e0c4316bdbedd7f9b483cf96bc0fab65002c18f65f5abae23410445ad24ad71a4d3f0da5c0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(phonenumbers) python311-phonenumbers python311-phonenumberslite python3dist(phonenumbers)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
