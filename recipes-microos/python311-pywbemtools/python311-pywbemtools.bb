SUMMARY = "Python client tools to work with WBEM Servers using the PyWBEM API"
DESCRIPTION = "Pywbemtools is a collection of command line tools that communicate with WBEM \
servers. The tools are written in pure Python and support Python 2 and Python \
3. \
 \
At this point, pywbemtools includes a single command line tool named \
pywbemcli that uses the python-pywbem package to issue operations to a \
WBEM server using the CIM/WBEM standards defined by the DMTF to perform \
system management tasks."
LICENSE = "Apache-2.0"

PV = "1.1.1"

RPM_NAME = "python311-pywbemtools-1.1.1-1.2.noarch.rpm"
RPM_HASH = "287edf87c33c02c4bf0310666a6db410a893b826a527aebc558743fdf116c2ee6ea44bdb108669acd60a41e339559814d8297276fa2fd7f7f453877caa4cad88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pywbemtools) python311-pywbemtools python3dist(pywbemtools)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-PyYAML python311-asciitree python311-click python311-click-repl python311-click-spinner python311-nocasedict python311-nocaselist python311-packaging python311-prompt_toolkit python311-psutil python311-pyparsing python311-pywbem python311-six python311-tabulate python311-toposort python311-yamlloader update-alternatives"

inherit rpm
