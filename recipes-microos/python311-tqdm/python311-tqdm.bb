SUMMARY = "An extensible progress meter"
DESCRIPTION = "tqdm lets you output a progress meter from within loops by wrapping \
any iterable with 'tqdm(iterable)'. \
tqdm's overhead is one order of magnitude less than python-progressbar \
and does not require ncurses."
LICENSE = "MIT & MPL-2.0"

PV = "4.65.0"

RPM_NAME = "python311-tqdm-4.65.0-1.1.noarch.rpm"
RPM_HASH = "4d57693e1312b9a9e5d4311e87428d488efc148e05be65088f79044f6a1284bf75ce4fe1fbb34ee90bb2feb180e073514af5770ef318c57537b92b02bc269d5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(tqdm) \
python311-tqdm \
python3dist(tqdm)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
update-alternatives"

inherit rpm
