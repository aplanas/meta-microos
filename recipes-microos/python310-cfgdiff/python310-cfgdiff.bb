SUMMARY = "Cfgdiff -- diff(1) all your configuration files"
DESCRIPTION = "cfgdiff will try to parse your configuration files, fetching all \
the relevant keys and values from them and then pretty-printing \
them in the original format. \
These results are then diffed and the diff is shown to you. \
 \
cfgdiff currently supports the following formats: \
 - INI using Python's ConfigParser library \
 - JSON using Python's JSON library \
 - YAML if the Python YAML library is installed \
 - XML if the Python lxml library is installed"
LICENSE = "MIT"

PV = "0.0.0+git.1641843506.dc1234a"

RPM_NAME = "python310-cfgdiff-0.0.0+git.1641843506.dc1234a-1.7.noarch.rpm"
RPM_HASH = "853ef004e05140343005decead36787a79fff2b2f7abf8d8dc38c856c7bdfe371764ad8fe77e21035379b7be7be63d280731b99d7ee5dae05202df2c5817ee64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cfgdiff \
python3-cfgdiff \
python3.10dist(cfgdiff) \
python310-cfgdiff \
python3dist(cfgdiff)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-PyYAML \
python310-configobj \
python310-dnspython \
python310-lxml"

inherit rpm
