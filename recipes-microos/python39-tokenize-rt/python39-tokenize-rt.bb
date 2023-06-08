SUMMARY = "A wrapper around the stdlib `tokenize` which roundtrips"
DESCRIPTION = "A wrapper around the stdlib `tokenize` which roundtrips."
LICENSE = "MIT"

PV = "4.2.1"

RPM_NAME = "python39-tokenize-rt-4.2.1-1.9.noarch.rpm"
RPM_HASH = "df47942b435c54f50956155b0eadcbab9cc3ca875ea57baecea93878338af50084383828f6cf51edb811b13243bd02d6bf4feb4dc2083cd45f8389bbaf166fe3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(tokenize-rt) python39-tokenize-rt python3dist(tokenize-rt)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) update-alternatives"

inherit rpm
