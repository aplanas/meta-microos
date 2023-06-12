SUMMARY = "Suite of tools and fixtures to manage daemons for testing"
DESCRIPTION = "Pifpaf is a suite of `fixtures`_ and a command-line tool that allows to start \
and stop daemons for a quick throw-away usage. This is typically useful when \
needing these daemons to run `integration testing`_. It originaly evolved from \
its precussor `overtest`_."
LICENSE = "Apache-2.0"

PV = "3.1.5"

RPM_NAME = "python39-pifpaf-3.1.5-2.4.noarch.rpm"
RPM_HASH = "1df1abca0976ebe36262b4926a082b6c6ceb107088c8d2c60c8b7b59022a365cd4a8ab4ab6311eb5e6d4fcae12f760fd2b91cff1564af25bbcb8b31f4a32130e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pifpaf) \
python39-pifpaf \
python3dist(pifpaf)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-Jinja2 \
python39-click \
python39-daiquiri \
python39-fixtures \
python39-psutil \
python39-requests \
python39-testrepository \
python39-testtools \
python39-xattr \
update-alternatives"

inherit rpm
