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

RPM_NAME = "python39-humanfriendly-10.0-5.1.noarch.rpm"
RPM_HASH = "6dfcb81d80c1faa6b767a958418404aa09887baba80a918f8ecf17564b830ec8ed45ad9a23df582b5eff2a0eac11afbe8fc2af9a2c0064dd61143d41e3091760"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(humanfriendly) python39-humanfriendly python3dist(humanfriendly)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39 update-alternatives"

inherit rpm
