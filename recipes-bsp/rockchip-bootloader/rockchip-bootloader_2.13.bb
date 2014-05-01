# Copyright (C) 2014 NEO-Technologies
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Rockchip bootloader collection"
LICENSE = "CLOSED"

SRC_URI = "git://github.com/neo-technologies/rockchip-bootloader.git"
SRCREV_pn-${PN} = "${AUTOREV}"

S = "${WORKDIR}/git"

inherit deploy

do_deploy() {
    install -d ${DEPLOYDIR}
    install ${S}/${ROCKCHIP_BOOTLOADER_IMAGE}.bin ${DEPLOYDIR}/bootloader.bin
}

addtask deploy after do_install
do_package[noexec] = "1"
do_package_ipk[noexec] = "1"
do_package_write_ipk[noexec] = "1"
