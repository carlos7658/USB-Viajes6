package co.edu.usbcali.viajesusb.mapper;

import co.edu.usbcali.viajesusb.domain.TipoDestino;
import co.edu.usbcali.viajesusb.dto.TipoDestinoDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-17T12:17:36-0500",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.4.0.v20210708-0430, environment: Java 17 (Eclipse Adoptium)"
)
@Component
public class TipoDestinoMapperImpl implements TipoDestinoMapper {

    @Override
    public TipoDestinoDTO tipoDestinoToTipoDestinoDTO(TipoDestino tipoDestino) {
        if ( tipoDestino == null ) {
            return null;
        }

        TipoDestinoDTO tipoDestinoDTO = new TipoDestinoDTO();

        tipoDestinoDTO.setCodigo( tipoDestino.getCodigo() );
        tipoDestinoDTO.setDescripcion( tipoDestino.getDescripcion() );
        tipoDestinoDTO.setEstado( tipoDestino.getEstado() );
        tipoDestinoDTO.setFechaCreacion( tipoDestino.getFechaCreacion() );
        tipoDestinoDTO.setFechaModificacion( tipoDestino.getFechaModificacion() );
        tipoDestinoDTO.setIdTide( tipoDestino.getIdTide() );
        tipoDestinoDTO.setNombre( tipoDestino.getNombre() );
        tipoDestinoDTO.setUsuCreator( tipoDestino.getUsuCreator() );
        tipoDestinoDTO.setUsuModificador( tipoDestino.getUsuModificador() );

        return tipoDestinoDTO;
    }

    @Override
    public TipoDestino tipoDestinoDTOToTipoDestino(TipoDestinoDTO tipoDestinoDTO) {
        if ( tipoDestinoDTO == null ) {
            return null;
        }

        TipoDestino tipoDestino = new TipoDestino();

        tipoDestino.setCodigo( tipoDestinoDTO.getCodigo() );
        tipoDestino.setDescripcion( tipoDestinoDTO.getDescripcion() );
        tipoDestino.setEstado( tipoDestinoDTO.getEstado() );
        tipoDestino.setFechaCreacion( tipoDestinoDTO.getFechaCreacion() );
        tipoDestino.setFechaModificacion( tipoDestinoDTO.getFechaModificacion() );
        tipoDestino.setIdTide( tipoDestinoDTO.getIdTide() );
        tipoDestino.setNombre( tipoDestinoDTO.getNombre() );
        tipoDestino.setUsuCreator( tipoDestinoDTO.getUsuCreator() );
        tipoDestino.setUsuModificador( tipoDestinoDTO.getUsuModificador() );

        return tipoDestino;
    }

    @Override
    public List<TipoDestinoDTO> listTipoDestinoToListTipoDestinoDTO(List<TipoDestino> lsttipoDestino) {
        if ( lsttipoDestino == null ) {
            return null;
        }

        List<TipoDestinoDTO> list = new ArrayList<TipoDestinoDTO>( lsttipoDestino.size() );
        for ( TipoDestino tipoDestino : lsttipoDestino ) {
            list.add( tipoDestinoToTipoDestinoDTO( tipoDestino ) );
        }

        return list;
    }

    @Override
    public List<TipoDestinoDTO> listTipoDestinoDTOToListTipoDestino(List<TipoDestino> lsttipoDestino) {
        if ( lsttipoDestino == null ) {
            return null;
        }

        List<TipoDestinoDTO> list = new ArrayList<TipoDestinoDTO>( lsttipoDestino.size() );
        for ( TipoDestino tipoDestino : lsttipoDestino ) {
            list.add( tipoDestinoToTipoDestinoDTO( tipoDestino ) );
        }

        return list;
    }
}
