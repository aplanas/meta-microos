SUMMARY = "A repository of test results"
DESCRIPTION = "This project provides a database of test results which can be used as part of \
developer workflow to ensure/check things like: \
 \
* No commits without having had a test failure, test fixed cycle. \
* No commits without new tests being added. \
* What tests have failed since the last commit (to run just a subset). \
* What tests are currently failing and need work. \
 \
Test results are inserted using subunit (and thus anything that can output \
subunit or be converted into a subunit stream can be accepted)."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "0.0.20"

RPM_NAME = "python311-testrepository-0.0.20-10.1.noarch.rpm"
RPM_HASH = "6c5f2724f4b3dcbc0c73c6518f90a7ddc8a918efa2bd35e206493ec9349a8247d6923b9b67be2d222c5535c1f2c4a6da8a37cbf07a52ad795cdc42abfefde642"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(testrepository) \
python311-testrepository \
python3dist(testrepository)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-dbm \
python311-extras \
python311-fixtures \
python311-python-subunit \
python311-testscenarios \
python311-testtools \
update-alternatives"

inherit rpm
