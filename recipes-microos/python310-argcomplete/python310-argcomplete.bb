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

RPM_NAME = "python310-argcomplete-3.0.8-1.1.noarch.rpm"
RPM_HASH = "a7101608759b0b036434f709bf35e852a9b4439cbf05dc9dc3c4e8b578d4c46ff9a1d39654e92d1050e286495a567618d288d7d1949c6ee913c7f01e5001ee41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-argcomplete python3.10dist(argcomplete) python310-argcomplete python3dist(argcomplete)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) update-alternatives"

inherit rpm
