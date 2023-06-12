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

RPM_NAME = "python311-argh-0.26.2-5.6.noarch.rpm"
RPM_HASH = "291332ef2082cc0637e9014b5655a03db4b75a43bef2cf09e0706f892a56076c1cca3b4220337c0ed260ccb3c318524c4928b2c62b11b813fe148300f53ce9b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(argh) \
python311-argh \
python3dist(argh)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
