SUMMARY = "Transactional Base System"
DESCRIPTION = "This is the base system for a host updated by Transactional Updates. Includes Tools for systems with a read-only root filesystem."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-transactional_base-20200505-40.1.aarch64.rpm"
RPM_HASH = "d70e9e68bd6762b04a6dab02179f6cfcee411e5792f27a0e9aaf6a60b703cb47054a67a2bb8761488bb0be0f413ca76af02cb632d5fe0a5b84032ee8a713087b"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() patterns-base-transactional_base patterns-base-transactional_base(aarch-64)"
RDEPENDS:${PN} += "microos-tools pattern() read-only-root-fs rebootmgr systemd-presets-branding-transactional-server transactional-update transactional-update-zypp-config"

inherit rpm
