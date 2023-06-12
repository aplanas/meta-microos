SUMMARY = "Bash tab completion for argparse"
DESCRIPTION = "Argcomplete provides easy, extensible command line tab completion of \
arguments for your Python script. \
 \
It makes two assumptions: \
 \
* You're using bash as your shell \
* You're using argparse to manage your command line arguments/options \
 \
Argcomplete is particularly useful if your program has lots of options \
or subparsers, and if your program can dynamically suggest completions \
for your argument/option values (for example, if the user is browsing \
resources over the network)."
LICENSE = "Apache-2.0"

PV = "3.0.8"

RPM_NAME = "python311-argcomplete-3.0.8-2.1.noarch.rpm"
RPM_HASH = "0c739108628a9002ae8969376f42de4a1031388c84b72b23480ad04d1269354611b4c51c890208b6c248c2dcf3c9ea779dd880288b5088c4f90e76973e0ac6e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(argcomplete) \
python311-argcomplete \
python3dist(argcomplete)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
update-alternatives"

inherit rpm
