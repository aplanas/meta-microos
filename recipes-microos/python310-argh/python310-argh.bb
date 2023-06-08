SUMMARY = "An argparse wrapper"
DESCRIPTION = "This Python module provides a wrapper for argparse with support for hierarchical \
commands that can be bound to modules or classes. \
 \
Features that argh adds to argparse: \
 \
* mark a function as a CLI command and specify its arguments before the parser \
  is instantiated; \
* nested commands made easy: no messing with subparsers (though they are of \
  course used under the hood); \
* infer agrument type from the default value; \
* infer command name from function name; \
* add an alias root command help for the --help argument; \
* enable passing unwrapped arguments to certain functions instead of a \
  argparse.Namespace object. \
 \
Argh is fully compatible with argparse. argh-agnostic and argh-aware code \
can be mixed. Keep in mind that argh.dispatch does some extra \
work that a custom dispatcher may not do."
LICENSE = "LGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "python310-argh-0.26.2-5.6.noarch.rpm"
RPM_HASH = "93e9f6c61ea15d1e2c5da457cbfc48988f25a19970ed5a0791a64da929d4de9dfd9b59efe5f165d77a546769f0a44e991c792a55ffcfed7e36f2a513d3a17281"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-argh python3.10dist(argh) python310-argh python3dist(argh)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
