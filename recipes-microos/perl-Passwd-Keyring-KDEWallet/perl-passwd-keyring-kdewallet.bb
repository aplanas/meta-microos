SUMMARY = "Password storage implementation based on KDE Wallet"
DESCRIPTION = "Password storage implementation based on KDE Wallet."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.0001"

RPM_NAME = "perl-Passwd-Keyring-KDEWallet-1.0001-1.11.noarch.rpm"
RPM_HASH = "5afed0c03d98828a7277c1acdd0b071f495f1c7c5cbf9547f2b936f74b08f5557170a7f2f275afb76bb257f702ee40feafe47bf099da7009f6b3771348700970"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Passwd::Keyring::KDEWallet) \
perl-Passwd-Keyring-KDEWallet"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(File::ShareDir) \
perl(Net::DBus) \
perl(Proc::SyncExec) \
perl(Try::Tiny)"

inherit rpm
