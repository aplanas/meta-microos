SUMMARY = "Human friendly input/output for text interfaces using Python"
DESCRIPTION = "The functions and classes in the humanfriendly package can be used to make \
text interfaces more user friendly. \
 \
 Some example features: \
  * Parsing and formatting numbers, file sizes, pathnames and timespans in \
    simple, human friendly formats. \
  * Easy to use timers for long running operations, with human friendly \
    formatting of the resulting timespans. \
  * Prompting the user to select a choice from a list of options by typing \
    the option’s number or a unique substring of the option. \
  * Terminal interaction including text styling (ANSI escape sequences), user \
    friendly rendering of usage messages and querying the terminal for its size."
LICENSE = "MIT"

PV = "10.0"

RPM_NAME = "python311-humanfriendly-10.0-5.1.noarch.rpm"
RPM_HASH = "69787fc726f25225b2c7822fd3967d48b726c4ed9fdfa5cb9c363b6a97342a1020c6c293b3533996d14d170f76f91cbec33e3443c7da448d93ac47cdb436eaf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(humanfriendly) \
python311-humanfriendly \
python3dist(humanfriendly)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311 \
update-alternatives"

inherit rpm
