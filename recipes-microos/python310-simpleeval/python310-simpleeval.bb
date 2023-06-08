SUMMARY = "A simple, safe single expression evaluator library"
DESCRIPTION = "A quick single file library for easily adding evaluatable expressions \
into python projects. Say you want to allow a user to set an alarm volume, \
which could depend on the time of day, alarm level, how many previous alarms \
had gone off, and if there is music playing at the time. \
 \
Or if you want to allow simple formulare in a web application, but don’t want \
to give full eval() access, or don’t want to run in javascript on the client side."
LICENSE = "MIT"

PV = "0.9.12"

RPM_NAME = "python310-simpleeval-0.9.12-1.7.noarch.rpm"
RPM_HASH = "9ece8ae78e97288fc6e1c0d18c2e7c1786b331c3cd542fa3d6e8a79fd1d639e1dc80a7c382489e2d4163c55da23b43d502d5114118e7a64456f466a30eff2d86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-simpleeval python3.10dist(simpleeval) python310-simpleeval python3dist(simpleeval)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
