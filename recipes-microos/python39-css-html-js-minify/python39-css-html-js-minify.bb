SUMMARY = "CSS HTML JS Minifier"
DESCRIPTION = "Async single-file cross-platform no-dependencies Minifier for the Web"
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "2.5.5.git.1523718195.8f72452"

RPM_NAME = "python39-css-html-js-minify-2.5.5.git.1523718195.8f72452-1.15.noarch.rpm"
RPM_HASH = "456e811aa373219f82349444774db462755bf8ae9d1733b6043179b7a186fad1c9a14f1f2ab1d654e2793922a6fb9dad5ce15536cbbaef1587345e9c029b857b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(css-html-js-minify) python39-css-html-js-minify python3dist(css-html-js-minify)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) update-alternatives"

inherit rpm
