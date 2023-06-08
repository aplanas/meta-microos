SUMMARY = "Kernel firmware files for Atheros QCA988x WiFi drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Atheros QCA988x WiFi drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230427"

RPM_NAME = "kernel-firmware-ath10k-20230427-1.1.noarch.rpm"
RPM_HASH = "3e11dddacd368ab8e29c5860bea6281ee22cb3392de6dcd70a26c6d9055350d089d0eea16cb52bc85dc983c7bc3dd1c6746e6b12085e94adf264c535dd405f58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware(ath10k/QCA4019/hw1.0/board-2.bin) firmware(ath10k/QCA4019/hw1.0/firmware-5.bin) firmware(ath10k/QCA4019/hw1.0/notice_ath10k_firmware-5.txt) firmware(ath10k/QCA6174/hw2.1/board-2.bin) firmware(ath10k/QCA6174/hw2.1/board.bin) firmware(ath10k/QCA6174/hw2.1/firmware-5.bin) firmware(ath10k/QCA6174/hw2.1/notice_ath10k_firmware-5.txt) firmware(ath10k/QCA6174/hw3.0/board-2.bin) firmware(ath10k/QCA6174/hw3.0/board.bin) firmware(ath10k/QCA6174/hw3.0/firmware-4.bin) firmware(ath10k/QCA6174/hw3.0/firmware-6.bin) firmware(ath10k/QCA6174/hw3.0/firmware-sdio-6.bin) firmware(ath10k/QCA6174/hw3.0/notice_ath10k_firmware-4.txt) firmware(ath10k/QCA6174/hw3.0/notice_ath10k_firmware-6.txt) firmware(ath10k/QCA6174/hw3.0/notice_ath10k_firmware-sdio-6.txt) firmware(ath10k/QCA9377/hw1.0/board-2.bin) firmware(ath10k/QCA9377/hw1.0/board.bin) firmware(ath10k/QCA9377/hw1.0/firmware-5.bin) firmware(ath10k/QCA9377/hw1.0/firmware-6.bin) firmware(ath10k/QCA9377/hw1.0/firmware-sdio-5.bin) firmware(ath10k/QCA9377/hw1.0/notice_ath10k_firmware-5.txt) firmware(ath10k/QCA9377/hw1.0/notice_ath10k_firmware-6.txt) firmware(ath10k/QCA9377/hw1.0/notice_ath10k_firmware-sdio-5.txt) firmware(ath10k/QCA9887/hw1.0/board.bin) firmware(ath10k/QCA9887/hw1.0/firmware-5.bin) firmware(ath10k/QCA9887/hw1.0/notice_ath10k_firmware-5.txt) firmware(ath10k/QCA9888/hw2.0/board-2.bin) firmware(ath10k/QCA9888/hw2.0/firmware-5.bin) firmware(ath10k/QCA9888/hw2.0/notice_ath10k_firmware-5.txt) firmware(ath10k/QCA988X/hw2.0/board.bin) firmware(ath10k/QCA988X/hw2.0/firmware-4.bin) firmware(ath10k/QCA988X/hw2.0/firmware-5.bin) firmware(ath10k/QCA988X/hw2.0/notice_ath10k_firmware-4.txt) firmware(ath10k/QCA988X/hw2.0/notice_ath10k_firmware-5.txt) firmware(ath10k/QCA9984/hw1.0/board-2.bin) firmware(ath10k/QCA9984/hw1.0/firmware-5.bin) firmware(ath10k/QCA9984/hw1.0/notice_ath10k_firmware-5.txt) firmware(ath10k/QCA99X0/hw2.0/board-2.bin) firmware(ath10k/QCA99X0/hw2.0/firmware-5.bin) firmware(ath10k/QCA99X0/hw2.0/notice_ath10k_firmware-5.txt) firmware(ath10k/WCN3990/hw1.0/board-2.bin) firmware(ath10k/WCN3990/hw1.0/firmware-5.bin) firmware(ath10k/WCN3990/hw1.0/notice.txt_wlanmdsp) firmware(ath10k/WCN3990/hw1.0/wlanmdsp.mbn) firmware(qcom/sdm845/wlanmdsp.mbn) kernel-firmware-ath10k"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch dracut"

inherit rpm
