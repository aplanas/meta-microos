SUMMARY = "PHP module for talking to a sieve server"
DESCRIPTION = "This package provides an API to talk to servers implementing the managesieve protocol. It can be used to install and remove sieve scripts, mark them active etc."
LICENSE = "BSD-2-Clause"

PV = "1.4.6"

RPM_NAME = "php-pear-Net_Sieve-1.4.6-1.2.noarch.rpm"
RPM_HASH = "1a08c91f47822f5c4a63ddb7e07adaebd5658daac87a8dc359976f78729c3f63e55fbab831965dbf11dae3ddd050fa46a1de743938d8dde3df10044e3db8db70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "php-pear(Net_Sieve) php-pear-Net_Sieve php5-pear-Net_Sieve php7-pear-Net_Sieve"
RDEPENDS:${PN} += "/bin/sh php-pear php-pear(Net_Socket)"

inherit rpm
