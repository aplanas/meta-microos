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

RPM_NAME = "python39-simpleeval-0.9.12-1.7.noarch.rpm"
RPM_HASH = "5ac5928a638a2164b628df516d66f3e503ed650101b38a50aa6a022f0f3ea7c2ce4df5fcc175cfe72669b7d00eace81003f5c8a6ce1d89c4ddfbdf0e79956475"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(simpleeval) python39-simpleeval python3dist(simpleeval)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
